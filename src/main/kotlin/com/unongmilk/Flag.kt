package com.unongmilk

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material

object Flag {
    var redFlagLocationArrayList = arrayListOf<Location>()
    var blueFlagLocationArrayList = arrayListOf<Location>()
    var redFlagLocation = Location(Bukkit.getWorlds()[0], 0.0, 0.0, 0.0)
    var blueFlagLocation = Location(Bukkit.getWorlds()[0], 0.0, 0.0, 0.0)
    var isPlaced = false
    fun placeFlag() {
        if (isPlaced) return
        redFlagLocation = redFlagLocationArrayList[(0 until blueFlagLocationArrayList.size - 1).random()]
        blueFlagLocation = blueFlagLocationArrayList[(0 until blueFlagLocationArrayList.size - 1).random()]
        redFlagLocation.block.type = Material.REDSTONE_BLOCK
        blueFlagLocation.block.type = Material.LAPIS_BLOCK
    }
}