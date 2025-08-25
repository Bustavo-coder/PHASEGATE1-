const prompt = require('prompt-sync')()

const getInput = (prompt_messsage) =>{
	let userInput = prompt(prompt_messsage)
	return  userInput
	}
const validateInput = (input) =>{
	check_length = input.length >= 13 && input.length <= 16
	return check_length

	}
const getCardNoToArrays = (input) =>{
	const array = input.split("");
	return array
	}

const getTypeOfCard = (input) =>{
	cardType = "Invalid Card"
	if(input.charAt(0) == "4") cardType = "Visa Card"
	if(input.charAt(0) == "5") cardType = "Master Card"
	if(input.charAt(0) == "6") cardType = "Discover Card"
	if(input.charAt(0) == "3" && input.charAt(1) == "7"  ) cardType = "American Express Card"
	return cardType 
	}

const calculateCard = (array)=>{
	sumOfOddPosition = 0
	sumOfEvenPosition = 0
	for (let count = array.length -1 ; count >= 0; count--){
		element = Number(array[count])
		getSquare = 2 * element
		if(getSquare > 9){
			getStringSquare = String(getSquare)
			getSquare = Number(getStringSquare.charAt(0)) + Number(getStringSquare.charAt(1))
			}
		if(count % 2 == 0) sumOfEvenPosition += getSquare 
		else sumOfOddPosition += element
			}
		sum = sumOfOddPosition + sumOfEvenPosition
		return sum;
	}

const validateCard = (sumOfCaluculateCard) =>{
	response = "Invalid"
	if(sumOfCaluculateCard % 10 == 0) response = "Valid"
	return response
	}

const mainInterface = () =>{
	console.log("***************************************************************")
	userInput =  getInput('Kindly Enter Your Credit Card No ')
	console.log(`Credit Card No : ${userInput}`)
	if(validateInput(userInput)){
	console.log(`Credit Card Digit Length : ${userInput.length}`)
	console.log(`Credit Card Type : ${getTypeOfCard(userInput )}`)
	getArrayCardNo = getCardNoToArrays(userInput)	
	calCard = calculateCard(getArrayCardNo)
	console.log(`Credit Card Validity Status :${validateCard(calCard )} `)		
			}
	else {	
	console.log(`Credit Card Digit Length :Must Be between 13 and 16`)
	console.log(`Credit Card Type : Invalid`)
	console.log(`Credit Card Validity Status :Invalid `)		

			}

	}
mainInterface() 