package org.apollo.game.event.impl;

import org.apollo.game.event.Event;
import org.apollo.game.model.Item;

/**
 * An {@link Event} sent to the client to update the amount of an item display on a tile.
 * 
 * @author Major
 */
public final class UpdateTileItemEvent extends Event {

	/**
	 * The {@link Item}.
	 */
	private final Item item;

	/**
	 * The offset from the client's base position.
	 */
	private final int positionOffset;

	/**
	 * The previous amount of the item (if it is being updated).
	 */
	private final int previousAmount;

	/**
	 * Creates a new event that updates the previous amount of the item.
	 * 
	 * @param id The item to be placed.
	 * @param previousAmount The previous amount of the item.
	 */
	public UpdateTileItemEvent(Item item, int previousAmount) {
		this(item, previousAmount, 0);
	}

	/**
	 * Creates a new set tile item event.
	 * 
	 * @param id The item to be placed.
	 * @param previousAmount The previous amount of the item.
	 * @param positionOffset The offset from the client's base position.
	 */
	public UpdateTileItemEvent(Item item, int previousAmount, int positionOffset) {
		this.item = item;
		this.previousAmount = previousAmount;
		this.positionOffset = positionOffset;
	}

	/**
	 * Gets the amount of the item.
	 * 
	 * @return The amount.
	 */
	public int getAmount() {
		return item.getAmount();
	}

	/**
	 * Gets the id of the item.
	 * 
	 * @return The item.
	 */
	public int getId() {
		return item.getId();
	}

	/**
	 * Gets the offset from the client's base position.
	 * 
	 * @return The offset.
	 */
	public int getPositionOffset() {
		return positionOffset;
	}

	/**
	 * Gets the previous amount of the item.
	 * 
	 * @return The previous amount.
	 */
	public int getPreviousAmount() {
		return previousAmount;
	}

}