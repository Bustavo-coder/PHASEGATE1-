const prompt = require('prompt-sync')()
function promptuser(message){
	userInput = prompt(message)
	userInput = userInput.toLowerCase()
	return userInput
	}
function checkInput(input){
	score = 0
	if(input == 'a'|| input == 'b') score = 1
	else {
		while(score != 1){
		console.log("Expected A or B as Response,\n I Know this is an Error Please Try again")
		input = prompt('Pick Either A OR B   ').toLowerCase()
		if(input == 'a' || input == 'b') score = 1
		}

			}
	return input
	}

userName = prompt("What Is Your Name  ")
console.log(`welcome ${userName}`)

const listOfQustions = [
			{
				a: 'A .>>> Expend Energy, enjoy groups',
				b: 'B.>>> Conserve energy,enjoy one-on-one',
				},
			{
				a: 'A .>>> Interpret Literally',
				b: 'B.>>> Looking for Meaning,and Possibilities',
				},
			{
				a: 'A .>>> Logical Thinking , Questioning',
				b: 'B.>>> Empathetic Feeling , and Accomodating',
				},
		]

function displayQuestionandStoreResponse(questions){
storeReponse = []
	for(let count = 0; count < questions.length;count++){
		for(element in questions[count]){
			console.log(questions[count][element])
					}
		input = promptuser('Pick Either A OR B   ').toLowerCase()
		 response = checkInput(input)
		storeReponse.push(response)
		}
	return storeReponse
}


