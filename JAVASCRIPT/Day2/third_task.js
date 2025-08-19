function getAmountPeopleLikes(array){
	let feedback
	if(array.length == 0) feedback = 'No One Likes This'
	if(array.length == 1) feedback = `${array[0]} Likes This`
	if(array.length == 2) feedback = `${array[0]} and ${array[1]} Likes This`
	if(array.length == 3) feedback = `${array[0]},${array[1]} and ${array[2]} Likes This`
	if(array.length > 3) feedback = `${array[0]},${array[1]} and ${array.length - 2} Likes This`	
	return feedback
	}
console.log(getAmountPeopleLikes(['Ade','Qudus','Juwon']))
console.log(getAmountPeopleLikes(['Ade','Qudus','Juwonn','Fatai','Yemi','Lattef']))