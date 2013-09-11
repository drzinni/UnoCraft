package com.danielzinni.unocraft;

import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin
{
	static Player[] Players;
	static Deck thedeck;
	static Player currentplayer;
	
	
	
	public static void main (String [] args)
	{
		setupgame();
	}
	
	public void onEnable()
	{
		getLogger().info("UnoCraft has been enabled");
	}
	
	public void onDisable()
	{
		getLogger().info("Unocraft has been diabled");
	}
	
	public static void setupgame()
	{		
		thedeck.setCardsleft(108);
		Game thegame = new Game(Players, thedeck, currentplayer, 10, 2, 0);	
	}
	
	public static void makedeck()
	{
		Card redzero = new Card(0, "Red Zero", 0);
		Card redonea = new Card();
		Card redoneb = new Card();
		Card redtwoa = new Card();
		Card redtwob = new Card();
		Card redthreea = new Card();
		Card redthreeb = new Card();
		Card redfoura = new Card();
		Card redfourb = new Card();
		Card redfivea = new Card();
		Card redfiveb = new Card();
		Card redsixa = new Card();
		Card redsixb = new Card();
		Card redsevena = new Card();
		Card redsevenb = new Card();
		Card redeighta = new Card();
		Card redeightb = new Card();
		Card redninea = new Card();
		Card rednineb = new Card();
		Card greenzero = new Card();
		Card greenonea = new Card();
		Card greenoneb = new Card();
		Card greentwoa = new Card();
		Card greentwob = new Card();
		Card greenthreea = new Card();
		Card greenthreeb = new Card();
		Card greenfoura = new Card();
		Card greenfourb = new Card();
		Card greenfivea = new Card();
		Card greenfiveb = new Card();
		Card greensixa = new Card();
		Card greensixb = new Card();
		Card greensevena = new Card();
		Card greensevenb = new Card();
		Card greeneighta = new Card();
		Card greeneightb = new Card();
		Card greenninea = new Card();
		Card greennineb = new Card();
		Card bluezero = new Card();
		Card blueonea = new Card();
		Card blueoneb = new Card();
		Card bluetwoa = new Card();
		Card bluetwob = new Card();
		Card bluethreea = new Card();
		Card bluethreeb = new Card();
		Card bluefoura = new Card();
		Card bluefourb = new Card();
		Card bluefivea = new Card();
		Card bluefiveb = new Card();
		Card bluesixa = new Card();
		Card bluesixb = new Card();
		Card bluesevena = new Card();
		Card bluesevenb = new Card();
		Card blueeighta = new Card();
		Card blueeightb = new Card();
		Card blueninea = new Card();
		Card bluenineb = new Card();
		Card yellowzero = new Card();
		Card yellowonea = new Card();
		Card yellowoneb = new Card();
		Card yellowtwoa = new Card();
		Card yellowtwob = new Card();
		Card yellowthreea = new Card();
		Card yellowthreeb = new Card();
		Card yellowfoura = new Card();
		Card yellowfourb = new Card();
		Card yellowfivea = new Card();
		Card yellowfiveb = new Card();
		Card yellowsixa = new Card();
		Card yellowsixb = new Card();
		Card yellowsevena = new Card();
		Card yellowsevenb = new Card();
		Card yelloweighta = new Card();
		Card yelloweightb = new Card();
		Card yellowninea = new Card();
		Card yellownineb = new Card();
		Card redskipa = new Card();
		Card redskipb = new Card();
		Card redreversea = new Card();
		Card redreversb = new Card();
		Card reddrawtwoa = new Card();
		Card reddrawtwob = new Card();
		Card greenskipa = new Card();
		Card greenskipb = new Card();
		Card greenreversea = new Card();
		Card greenreverseb = new Card();
		Card greendrawtwoa = new Card();
		Card greendrawtwob = new Card();
		Card blueskipa = new Card();
		Card blueskipb = new Card();
		Card bluereversea = new Card();
		Card bluereverseb = new Card();
		Card bluedrawtwoa = new Card();
		Card bluedrawtwob = new Card();
		Card yellowskipa = new Card();
		Card yellowskipb = new Card();
		Card yellowreversea = new Card();
		Card yellowreverseb = new Card();
		Card yellowdrawtwoa = new Card();
		Card yellowdrawtwob = new Card();
		Card wilda = new Card();
		Card wildb = new Card();
		Card wildc = new Card();
		Card wildd = new Card();
		Card wd4a = new Card();
		Card wd4b = new Card();
		Card wd4c = new Card();
		Card wd4d = new Card();
	}
}
