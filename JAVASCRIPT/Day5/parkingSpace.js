// Create an empty container to store cars
// Have a fetures That Takes cars From The User If The Space Is empty accpet car if not tell the customer space takes
// Have a Feature That collect userPacking and check if cars is in space if there is car remove car if not tell no car in the current Space 
// Have a feature That Can Show The Customers Available Space In The Container
// Create a Welome Message for the user 
// Create a phase Where the user can interact with the recptionist in my case program

carSpace = []
const prompt = require('prompt-sync')()
for (let count = 0; count < 20;count++){
	carSpace[count] = 0
	}


function parkCar(input){
		message = ""
		if(carSpace[input] == 0){
			carSpace[input] = 1
			message = "Car Parked Succesfuly"
		}
		else message = "Space Is Taken"

		return message
	}

function removeCar(input){
		removeMessage = ""
		if(carSpace[input] == 1){	
			carSpace[input] = 0
			removeMessage = "Car Removed Succesfuly"
			}
		else 	removeMessage = "The Space Is Empty No Car At Allocated Space"

		return removeMessage 
	}

function displayCarSpace(){

	return carSpace 

	}


function displayWelcomeMessage(){
		const display = `Welcome To Bustavo Parking Space Wherby Cars Are Trusted With Maximum Security.
			Parking Is Made Easy.
			>>>>>.1 To Park Car
			>>>>>.2 To Remove Car 
			>>>>>.3 To Display Parking Space
			>>>>>.0 To Exit
				`
		return display;		
	
	}


function userInterface(){
			loopConrol = true
			console.log(displayWelcomeMessage())
		while(loopConrol){
				userInput = Number(prompt('Enter The menu You Want To Enter  '))
				switch(userInput){
					case 1 :
						userCarSpace = Number(prompt('Enter The Space Number You Want To Park From 0-19  '))
						if(userCarSpace >= 0 && userCarSpace < carSpace.length){
								parkingMesage = parkCar(userCarSpace)
								console.log(parkingMesage)
								}
						else console.log('Invalid Space')

					backToMain = Number(prompt('Pres 00 to go Back '))
					break;

					case 2 :
						userCarSpace = Number(prompt('Enter The Space Number You Want To Remove Your Car 0-19  '))
							if(userCarSpace >= 0 && userCarSpace < carSpace.length){
								removeMesage = removeCar(userCarSpace)
								console.log(removeMesage)
								}
							else console.log('Car Space At Allocated Space Is Empty')
						backToMain = Number(prompt('Pres 00 to go Back '))
					break;

					case 3 :
						console.log(displayCarSpace());
						backToMain = Number(prompt('Pres 00 to go Back '))
					break;
							
					case 0 : loopConrol = false;
					default :
						console.log("Invalid Menu Option")
							}
					console.log(displayWelcomeMessage())

		
					}
		

	}

		 userInterface()