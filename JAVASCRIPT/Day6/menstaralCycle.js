const prompt = require('prompt-sync')()

function getInput(userprompt){
	userOutput = Number(prompt(userprompt)) 
	return userOutput
	}

const getFirstDateOfperiod =  getInput("Enter The Day Date Of The First Period  ")
const getFirstMonthOfperiod = getInput("Enter The Month Of The First Period in Numbers  ") - 1
const getYearsOfFirstPeriod = getInput("Enter The Year Of The First Period  ")
const dateWhenTheperiodEnded = getInput("Enter The Day Date The Period Ended  ")

const getDateOfFirtPeriod = () => {
	dateOfFirstPeriod =  new Date(getYearsOfFirstPeriod,getFirstMonthOfperiod,getFirstDateOfperiod)
	return dateOfFirstPeriod
		}

const flowDate =   dateWhenTheperiodEnded - getDateOfFirtPeriod().getDate()
const LengthOfCycle = getInput("Enter Your Cycle Length  ")

const getFunctionGetDateOfNextCycle = () =>{
	getCycleLengthDate = getDateOfFirtPeriod()
	getCycleLengthDate.setDate(getCycleLengthDate.getDate() + LengthOfCycle )
		return getCycleLengthDate
	}

const getFunctionGetDateOfOvulation = () =>{
	getOvulationdate = getFunctionGetDateOfNextCycle()
	getOvulationdate.setDate(getOvulationdate.getDate() - 14)
	return getOvulationdate
	}



 

console.log(`This Is The Date Of Your First Period ${dateOfFirstPeriod.toString()}`)
console.log(`The period flow is ${flowDate} Days`)
console.log(`The Next period Is ${getFunctionGetDateOfNextCycle().toString()}`)
console.log(`The Ovulation cycle is  ${getFunctionGetDateOfOvulation().toString()}`)


//Milliseconds
//1000×60×60×24





