#!/usr/bin/env groovy
/*
 * Copyright (c) 2019 Questem Co., Ltd.
 */

pipeline {
	agent any
	tools {
		jdk 'Oracle JDK 8u201'
		maven 'Maven 3.3.9'
	}
	stages {
		stage('Initialize') {
			steps {
				sh 'printenv'
				sh 'mvn clean initialize help:effective-settings --batch-mode --show-version'
			}
		}
		stage('Build Pull Request') {
			when {
				changeRequest()
			}
			steps {
				sh 'mvn verify checkstyle:checkstyle pmd:pmd pmd:cpd findbugs:findbugs org.owasp:dependency-check-maven:check --batch-mode --update-snapshots'
			}
			post {
				always {
					junit allowEmptyResults:true, testResults:'**/target/surefire-reports/TEST-*.xml'
					junit allowEmptyResults:true, testResults:'**/target/failsafe-reports/TEST-*.xml'
				}
			}
		}
		stage('Deploy') {
			when {
				branch 'master'
			}
			steps {
				sh 'mvn deploy checkstyle:checkstyle pmd:pmd pmd:cpd findbugs:findbugs org.owasp:dependency-check-maven:check -Dmaven.test.skip=true -Dmaven.install.skip=true --batch-mode --update-snapshots'
			}
		}
	}
	post {
		always {
			recordIssues enabledForFailure: true, tools: [
				mavenConsole(),
				java(),
				javaDoc(),
				checkStyle(pattern: '**/target/checkstyle-result.xml'),
				pmdParser(pattern: '**/target/pmd.xml'),
				cpd(pattern: '**/target/cpd.xml'),
				findBugs(pattern: '**/target/findbugsXml.xml'),
				taskScanner(includePattern: '**/*.java,**/*.properties,**/*.xml', excludePattern: '**/target/*', highTags: 'BUG,FIXME', normalTags: 'HACK,TODO,XXX', lowTags: 'NOTE')
			]

			dependencyCheckPublisher pattern: '**/target/dependency-check-report.xml', usePreviousBuildAsReference: true
		}
		cleanup {
			sh "mvn clean --batch-mode"
			deleteDir()
		}
	}
}
