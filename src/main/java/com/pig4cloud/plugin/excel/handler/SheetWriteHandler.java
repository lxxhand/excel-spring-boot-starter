package com.pig4cloud.plugin.excel.handler;

import com.pig4cloud.plugin.excel.annotation.ResponseExcel;

import javax.servlet.http.HttpServletResponse;

/**
 * @author lengleng
 * @date 2020/3/29
 * <p>
 * sheet 写出处理器
 */
public interface SheetWriteHandler {

	/**
	 * 是否支持
	 *
	 * @param obj
	 * @return
	 */
	boolean support(Object obj);

	/**
	 * 返回的对象
	 *
	 * @param o             obj
	 * @param response      输出对象
	 * @param responseExcel 注解
	 */
	void export(Object o, HttpServletResponse response, ResponseExcel responseExcel);
}