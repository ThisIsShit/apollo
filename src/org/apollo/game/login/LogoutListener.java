package org.apollo.game.login;

import org.apollo.game.model.Player;

/**
 * An interface that should be implemented for actions that should be executed when the player logs out.
 * 
 * @author Major
 */
public abstract class LogoutListener {

	/**
	 * Executes the action for this listener.
	 * 
	 * @param player The player.
	 */
	public abstract void execute(Player player);

}