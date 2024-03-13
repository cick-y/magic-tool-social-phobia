package org.jeecg.common.aspect.annotation;

import java.lang.annotation.*;

/**
  *  数据权限注解
 * @Author 余维华
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
public @interface PermissionData {
	/**
	 * 暂时没用
	 * @return
	 */
	String value() default "";
	
	
	/**
	 * 配置菜单的组件路径,用于数据权限
	 */
	String pageComponent() default "";
}