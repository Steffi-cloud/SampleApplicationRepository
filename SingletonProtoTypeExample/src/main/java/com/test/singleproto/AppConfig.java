package com.test.singleproto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

public class AppConfig {
	@Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public MyProtoTypeBean prototypeBean() {
        return new MyProtoTypeBean();
    }

    @Bean
    public MySingletonBean singletonBean() {
        return new MySingletonBean();
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        MySingletonBean bean = context.getBean(MySingletonBean.class);
        bean.showMessage();
        Thread.sleep(1000);

        bean = context.getBean(MySingletonBean.class);
        bean.showMessage();
    }
}
