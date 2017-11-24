package org.malagu.linq.autoconfigure;

import org.malagu.linq.LinqConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * @author Kevin Yang (mailto:muxiangqiu@gmail.com)
 * @since 2017年11月24日
 */
@Configuration
@ConditionalOnClass(LinqConfiguration.class)
@AutoConfigureAfter(JpaRepositoriesAutoConfiguration.class)
@Import(LinqConfiguration.class)
public class LinqAutoConfiguration {
	
}
