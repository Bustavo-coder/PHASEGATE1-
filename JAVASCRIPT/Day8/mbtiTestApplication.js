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
				{
				a: 'A .>>> Organized, Orderly',
				b: 'B.>>> Flexible, Adaptable',
				},

				{
				a: 'A .>>> More Outgoing, Think out loud',
				b: 'B.>>> More Reserved, Think To Yourself',
				},
				{
				a: 'A .>>> Practical, Realistic, Experiential',
				b: 'B.>>> Imaginative, Innovative, Theoretical',
				},
				{
				a: 'A .>>> Candid, Straight Forward, Frank',
				b: 'B.>>> Tactful, Kind, Encouraging',
				},
				{
				a: 'A .>>> Plan, Schedule',
				b: 'B.>>> Unplanned, Spontaneous',
				},
				{
				a: 'A .>>> Seek Many Tasks, Public Activities, Interaction With Others',
				b: 'B.>>> Seek Private, Solitary Activities With Quiet to Concentrate',
				},
				{
				a: 'A .>>> Standard, Usual, Conventionals',
				b: 'B.>>> Different, Novel, Unique',
				},
				{
				a: 'A .>>> Firm, tend to Criticize, hold the line',
				b: 'B.>>> Gentle, Tend to Appreciate, Conciliate',
				},
				{
				a: 'A .>>>Regulated, Structured',
				b: 'B.>>>Easy-Going, Live and Let Live',
				},
				{
				a: 'A .>>>External, Communicative, Express Yourself',
				b: 'B.>>>Internal, Reticent, Keep to Yourself ',
				},
				{
				a: 'A .>>>Focus on here-and-now',
				b: 'B.>>>Look to The Future, Global Perspective, Big picture ',
				},
				{
				a: 'A .>>>Tough-Minded, Just',
				b: 'B.>>>Tender-hearted, merciful',
				},
				{
				a: 'A .>>>Preparation, Plan Ahead',
				b: 'B.>>>Go With the Flow, Adapt as you Go',
				},
				{
				a: 'A .>>>Active, Initiate',
				b: 'B.>>>Reflective, Deliberate',
				},
				{
				a: 'A .>>>Facts, Things, What Is',
				b: 'B.>>>Ideas, Dreams, What Could Be',
				},
				{
				a: 'A .>>>Matter of Fact, Issue-Oriented',
				b: 'B.>>>Sensitive, People-Oriented',
				},
				{
				a: 'A .>>>Control, Govern',
				b: 'B.>>>Latitude, Freedom',
				},
		]

function displayQuestionandStoreResponse(questions){
storeReponse = []
	for(let count = 0; count < listOfQustions.length;count++){
		for(element in questions[count]){
			console.log(questions[count][element])
					}
		input = promptuser('Pick Either A OR B   ').toLowerCase()
		 response = checkInput(input)
		storeReponse.push(response)
		}
	return storeReponse
}

arrayOfResponse = displayQuestionandStoreResponse(listOfQustions)// storing the response in an array

console.log(`Hello ${userName} You selected`)

personality = ""
for (let counter = 0;counter < 4;counter++){
		optionA = 0 ; optionB = 0
	for (let index = counter; index < listOfQustions.length; index+=4){
		console.log(listOfQustions[index][arrayOfResponse[index]])//Printing the positionquestion and using the storesponse Array to find their response
			if(arrayOfResponse[index] == 'a') optionA++
			else {optionB++}
			}
		console.log(`Number Of A : ${optionA}`)
		console.log(`Number Of B : ${optionB}`)

		if(counter == 0)letter1 = personality+= getPersonality(['E','I'])
		if(counter == 1)letter2 = personality+= getPersonality(['S','N'])
		if(counter == 2)letter3 = personality+= getPersonality(['T','F'])
		if(counter == 3)letter3 = personality+= getPersonality(['J','P'])
	}


function getPersonality(array){
	let letter
	if(optionA > optionB ) letter = array[0]
	else letter = array[1]
	return letter
}

console.log(`Your Personality is ${personality}`)

