package com.github.test;


public class Player {
	private static String name;
	private static int id;//��Ա���
	private static String team;
	private Player(String name,int id,String team) {
		this.name=name;
		this.id=id;
		this.team=team;
	}
	//˽�й��췽������ôjust of class loading ��ʱ��
	//���ط���
	public static void getPlayer(String name,int id,String team) {
		new Player( name,id, team);
		System.out.println(Player.name+Player.id+Player.team);
	}
}
