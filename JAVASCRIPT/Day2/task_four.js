function getPossibility(){
	milesToNextPump = 50
	avrageFuel = 25
	leftfuel = 2
	store = milesToNextPump == leftfuel* avrageFuel
	return store
	}
console.log(getPossibility())