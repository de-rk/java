package com.github.test;


public class Player {
	private static String name;
	private static int id;//球员编号
	private static String team;
	private Player(String name,int id,String team) {
		this.name=name;
		this.id=id;
		this.team=team;
	}
	//私有构造方法，那么just of class loading 的时候
	//加载法方
	public static void getPlayer(String name,int id,String team) {
		new Player( name,id, team);
		System.out.println(Player.name+Player.id+Player.team);
	}
}
