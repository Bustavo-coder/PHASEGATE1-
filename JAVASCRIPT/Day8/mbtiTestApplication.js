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


	const listOfPersonaltties = {
	'INTJ' : `Who is the Architect personality type?
	INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. 
	These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. 
	Their inner world is often a private, complex one. Thought constitutes the greatness of man. 
	Man is a reed, the feeblest thing in nature, but he is a thinking reed.Their Minds are never at rest, 
	these personalities may sometimes struggle to find people who can keep up with their nonstop analysis of everything around them.
 	But when they do find like-minded individuals who appreciate their intensity and depth of thought, 
	INTJs form profound and intellectually stimulating relationships that they deeply treasure`,

	'INTP' : `Who is the Logician personality type?
	INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. 
	These flexible thinkers enjoy taking an unconventional approach to many aspects of life. 
	They often seek out unlikely paths, mixing willingness to experiment with personal creativity.`,

	'ENTJ' : `Who is the Commander personality type?
	ENTJ (Commander) is a personality type with the Extraverted, Intuitive, Thinking, and Judging traits.
	They are decisive people who love momentum and accomplishment.They gather information to construct 
	their creative visions but rarely hesitate for long before acting on them.`,
	
	'ENTP' : `Who is the Debater personality type?
	ENTP (Debater) is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting traits. 
	They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility. 
	They pursue their goals vigorously despite any resistance they might encounter.`,

	'INFJ' : `Who is the Advocate personality type?
	INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits.
	They tend to approach life with deep thoughtfulness and imagination.Their inner vision, personal values, 
	and a quiet, principled version of humanism guide them in all things.`,

	'INFP' : `Who is the Mediator personality type?
	INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits.
	These rare personality types tend to be quiet, open-minded, and imaginative,
	and they apply a caring and creative approach to everything they do.`,

	'ENFJ' : `Who is the Protagonist personality type?
	ENFJ (Protagonist) is a personality type with the Extraverted, Intuitive, Feeling, and Judging traits. 
	These warm, forthright types love helping others, and they tend to have strong ideas and values. 
	They back their perspective with the creative energy to achieve their goals.`,

	'ENFP' : `Who is the Campaigner personality type?
	ENFP (Campaigner) is a personality type with the Extraverted, Intuitive, Feeling, and Prospecting traits. 
	These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. 
	Their vibrant energy can flow in many directions.`,
		
	'ISTJ' :`Who is the Logistician personality type?
	ISTJ (Logistician) is a personality type with the Introverted, Observant, Thinking, and Judging traits.
	These people tend to be reserved yet willful, with a rational outlook on life. 
	They compose their actions carefully and carry them out with methodical purpose.`,
	
	'ISFJ' :`Who is the Defender personality type?
	ISFJ (Defender) is a personality type with the Introverted, Observant, Feeling, and Judging traits. 
	These people tend to be warm and unassuming in their own steady way. 
	They’re efficient and responsible, giving careful attention to practical details in their daily lives`,

	'ESTJ' : `Who is the Executive personality type?
	ESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and Judging traits.
	They possess great fortitude, emphatically following their own sensible judgment.
	They often serve as a stabilizing force among others, 
	able to offer solid direction amid adversity.`,

	'ESFJ' :`Who is the Consul personality type?
	ESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits. 
	They are attentive and people-focused, and they enjoy taking part in their social community. 
	Their achievements are guided by decisive values, and they willingly offer guidance to others`,

	'ISTP' :`Who is the Virtuoso personality type?
	ISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits. 
	They tend to have an individualistic mindset, pursuing goals without needing much external connection. 
	They engage in life with inquisitiveness and personal skill, varying their approach as needed.`,


	'ISFP' : `Who is the Adventurer personality type?
	ISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting traits. 
	They tend to have open minds, approaching life, new experiences, and people with grounded warmth. 
	Their ability to stay in the moment helps them uncover exciting potentials.`,
	
	'ESTP' : `Who is the Entrepreneur personality type?
	ESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits. 
	They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. 
	They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.`,

	'ESFP' :`Who is the Entertainer personality type?
	ESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits. 
	These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown.
	They can be very social, often encouraging others into shared activities.`,	
			}



console.log(`Your Personality is ${personality}`)
console.log(listOfPersonaltties[personality])


