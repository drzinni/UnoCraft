package com.danielzinni.unocraft;

public class Game 
{
	Player[] players;
	Deck thedeck;
	Player currentplayer;
	int maxplayers = 10;
	int minplayers = 2;
	int playercount;
	
	
	public Game(Player [] players, Deck thedeck, Player currentplayer, int maxplayers, int minplayers, int playercount)
	{
		this.players = players;
		this.thedeck = thedeck;
		this.currentplayer = currentplayer;
		this.maxplayers = 10;
		this.minplayers = 2;
		this.playercount = playercount;
	}


	public Player[] getPlayers() {
		return players;
	}


	public void setPlayers(Player[] players) {
		this.players = players;
	}


	public Deck getThedeck() {
		return thedeck;
	}


	public void setThedeck(Deck thedeck) {
		this.thedeck = thedeck;
	}


	public Player getCurrentplayer() {
		return currentplayer;
	}


	public void setCurrentplayer(Player currentplayer) {
		this.currentplayer = currentplayer;
	}


	public int getMaxplayers() {
		return maxplayers;
	}


	public void setMaxplayers(int maxplayers) {
		this.maxplayers = maxplayers;
	}


	public int getMinplayers() {
		return minplayers;
	}


	public void setMinplayers(int minplayers) {
		this.minplayers = minplayers;
	}


	public int getPlayercount() {
		return playercount;
	}


	public void setPlayercount(int playercount) {
		this.playercount = playercount;
	}
}
