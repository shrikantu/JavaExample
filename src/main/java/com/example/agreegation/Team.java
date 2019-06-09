package com.example.agreegation;

import java.util.List;

public class Team {
	private final List<Member> members;

	public Team(List<Member> members) {
		this.members = members;
	}
}

class Member {
	private final String name;

	Member(String name) {
		this.name = name;
	}
}
