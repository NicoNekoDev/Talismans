package com.willfp.talismans.command

import com.willfp.eco.core.command.impl.Subcommand
import com.willfp.talismans.plugin
import org.bukkit.command.CommandSender

object CommandReload : Subcommand(
    plugin,
    "reload",
    "talismans.command.reload",
    false
) {
    override fun onExecute(sender: CommandSender, args: List<String>) {
        sender.sendMessage(
            plugin.langYml.getMessage("reloaded")
                .replace("%time%", plugin.reloadWithTime().toString() + "")
        )
    }
}