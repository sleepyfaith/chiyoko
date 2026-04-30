# Chiyoko

chiyoko is a minecraft mod that reveals the next outcome for certain loot tables before they happen by simulating the exact steps the game takes to advance rng. 

## Features

- displays the next drop before it occurs
- ability to change indicator position on screen
- configuration such as visibility, rotation, reversal
- will attempt to fix desyncs in multiplayer by advancing until it finds a matching result

## Currently supported loot tables

- wither skeleton - config supports `kills until skull` and `next drops`
- next item from fishing 
- next item piglin bartering
- next item when breaking gravel


## Limitations 
- cannot predict 'unstable' rng, such as bones to tame a wolf.
- unable to automatically grab world seed in multiplayer
- uses 1.20+ loot table changes, so its impossible to make this work on versions below 1.20
