package net.ornithemc.osl.commands.api;

import java.util.function.Consumer;

import com.mojang.brigadier.CommandDispatcher;

import net.minecraft.server.command.source.CommandSourceStack;

import net.ornithemc.osl.core.api.events.Event;

public class CommandEvents {

	public static final Event<Consumer<CommandDispatcher<CommandSourceStack>>> REGISTER_SERVER_COMMANDS = Event.consumer();

}
