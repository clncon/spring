package cn.itcast.strust2_spring.listen;

import org.springframework.context.ApplicationEvent;

public class myEvent extends ApplicationEvent {

	public myEvent(Object source) {
		super(source);
	}

}
