package com.github.test;


public class Player {
	String name;
	static int id;//«Ú‘±±‡∫≈
	String team;
	public Player(String name,int id,String team){
		this.name=name;
		this.id=id;
		this.team=team;
		System.out.println(id+"  "+name+"   "+team);
	}
}
