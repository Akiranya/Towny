package com.palmergames.bukkit.towny.event.nation;

import com.palmergames.bukkit.towny.event.CancellableTownyEvent;
import com.palmergames.bukkit.towny.object.Nation;
import com.palmergames.bukkit.towny.object.Town;
import com.palmergames.bukkit.towny.object.Translation;

public class NationPreTownKickEvent extends CancellableTownyEvent {

	private final String townName;
	private final Town town;
	private final String nationName;
	private final Nation nation;

	/**
	 * Cancellable event thrown when a nation kicks a town using /n kick.
	 * 
	 * @param nation Nation doing the kicking.
	 * @param town Town leaving the nation.
	 */
	public NationPreTownKickEvent(Nation nation, Town town) {
		this.townName = town.getName();
		this.town = town;
		this.nation = nation;
		this.nationName = nation.getName();
		setCancelMessage(Translation.of("msg_err_command_disable"));
	}

	public String getTownName() {
		return townName;
	}

	public String getNationName() {
		return nationName;
	}

	public Town getTown() {
		return town;
	}

	public Nation getNation() {
		return nation;
	}
}
