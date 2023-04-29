package com.nt;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyTestRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		System.out.println("MyTestRouter.configure()");
		//from("file:D:\\Games\\source").to("file:D:\\Games\\destination");

		//from("file:D:\\Games\\source?noop=true").to("file:D:\\Games\\destination");
		from("{{my.loc.source}}").to("{{my.loc.destination}}");
	}

}
