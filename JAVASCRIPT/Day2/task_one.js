function getAgeDiffrence(fatherAge,sonsAge){
		let diffrence = 0
		if (fatherAge > 2 * sonsAge)diffrence = fatherAge - 2 * sonsAge
		else if(fatherAge < 2 * sonsAge) diffrence = 2 * sonsAge - fatherAge
		else diffrence = 0
		return diffrence 

	}
	console.log(getAgeDiffrence(50,10))
	console.log(getAgeDiffrence(30,15))
	console.log(getAgeDiffrence(20,15))