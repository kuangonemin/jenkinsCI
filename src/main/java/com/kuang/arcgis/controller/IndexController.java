package com.kuang.arcgis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index.htm")
	public String indexController(HttpServletRequest request, HttpServletResponse response) {
		return "index";
	}

	@RequestMapping("/arcgis.htm")
	public String arcGisTest(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis";
	}

	//查找
	@RequestMapping("/search-arcgis.htm")
	public String arcGis_search(HttpServletRequest request, HttpServletResponse response) {
		return "search-arcgis";
	}


	@RequestMapping("/arcgis_graphics.htm")
	public String arcgis_graphics(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_graphics";
	}

	//点击事件  有定位显示经纬度的功能
	@RequestMapping("/arcgis_click.htm")
	public String arcgis_click(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_click";
	}


	//添加图层
	@RequestMapping("/arcgis_addlayer.htm")
	public String arcgis_addlayer(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_addlayer";
	}

	@RequestMapping("/arcgis_dymaticlayer.htm")
	public String arcgis_dymaticlayer(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_dymaticlayer";
	}

	@RequestMapping("/arcgis_mapId.htm")
	public String arcgis_mapId(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_mapId";
	}

	@RequestMapping("/arcgis_arcgis_server.htm")
	public String arcgis_arcgis_server(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_arcgis_server";
	}

	@RequestMapping("/arcgis_click_view.htm")
	public String arcgis_click_view(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_click_view";
	}

	@RequestMapping("/arcgis_simple_search.htm")
	public String arcgis_simple_search(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_simple_search";
	}

	@RequestMapping("/arcgis_input_search.htm")
	public String arcgis_input_search(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_input_search";
	}

	@RequestMapping("/arcgis_simple_dram.htm")
	public String arcgis_simple_dram(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_simple_dram";
	}

	//在地图上画线
	@RequestMapping("/arcgis_dram_line.htm")
	public String arcgis_dram_line(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_dram_line";
	}

	/*
	* 将服务器上发布的地图导进工程 使用MapImageLayer
	*/
	@RequestMapping("/arcgis_server.htm")
	public String arcgis_server(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_server";
	}

	@RequestMapping("/arcgis_select.htm")
	public String arcgis_select(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_select";
	}

	@RequestMapping("/arcgis_polyline.htm")
	public String arcgis_polyline(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_polyline";
	}

	@RequestMapping("/arcgis_route.htm")
	public String arcgis_route(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_route";
	}

	//计算轨迹的路径距离
	@RequestMapping("/arcgis_select_popus.htm")
	public String arcgis_popus(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_popus";
	}

	@RequestMapping("/arcgis_popus_t.htm")
	public String arcgis_popus_t(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_popus_t";
	}

	//画折线
	@RequestMapping("/arcgis_line.htm")
	public String arcgis_line(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_line";
	}

	//根据点将线段放在layer上  鼠标移动变色
	@RequestMapping("/arcgis_polyline_layer.htm")
	public String polyline_layer(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_polyline_layer";
	}

	//FeatureLayer鼠标放上去 高亮显示并显示信息
	@RequestMapping("/arcgis_mouse.htm")
	public String mouse(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_mouse";
	}

	@RequestMapping("/arcgis_scene.htm")
	public String scene(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_scene";
	}


	@RequestMapping("/arcgis_feature.htm")
	public String feature(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_feature";
	}

	//图片标注 (例如水质信息的等级)
	@RequestMapping("/arcgis_point_picture.htm")
	public String point_picture(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_point_picture";
	}

	@RequestMapping("/arcgis_point_picture2.htm")
	public String point_picture2(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_point_picture2";
	}

	@RequestMapping("/arcgis_polyline_server.htm")
	public String polyline_server(HttpServletRequest request, HttpServletResponse response) {
		return "arcgis_polyline_server";
	}

	//ajax 带token下载
	@RequestMapping("/ajax_download.htm")
	public String ajax_download(HttpServletRequest request, HttpServletResponse response) {
		return "ajax_download";
	}
}
