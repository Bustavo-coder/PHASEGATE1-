itemList = []
const prompt = require('prompt-sync')()
const addItemToList = (input)=>{
	itemList.push(input)

	} 

const removeItem = (input)=>{
	getIndexOfItem = itemList.indexOf(input)
	let checkReturn;
	if(getIndexOfItem > 0){
	itemList.splice(getIndexOfItem,1)
	checkReturn = "Removed Succesfuly"
		}
	else checkReturn = "Item Not Found"
	return checkReturn
	}
const displayList = () =>{
	return itemList.toString()

	}

const printInterFace =()=>{
	const welcomeInterface = 
		`Welcome to Bustavo Stores Wherre You Can Add and Remove Item
			>>>>>> 1. Add Item
			>>>>>> 2. Remove Item
			>>>>>> 3. Show List
			>>>>>> 0. Exit
			`
		return welcomeInterface
}

function switchUserInput(){
	console.log(printInterFace())
	let userInuput;
		do{
		userInuput = Number(prompt("Choose From The Numbers To Pick A menu  "))
			if(userInuput != 0){
			switch(userInuput){
			case 1 :
				userItemInput = prompt("Input The Item You Want To Add   ").toLowerCase()
				addItemToList(userItemInput)
				console.log("Item Added Succesfuly")
			break;
			case 2 :
				userItemInput = prompt("Input The Item You Want to remove   ").toLowerCase()
				let messageUser = removeItem(userItemInput)
				console.log(messageUser)
			break;
			case 3 :
				console.log(displayList())  //B87E4405
			break;
			default :
				console.log("Invalid Input Not Menu With Input")
			
					}
			
				console.log(printInterFace())
			}
		

		}while(userInuput != 0)

	}

	switchUserInput()