let schoolDatabase = []
const prompt = require('prompt-sync')()
const amountOfStudents = Number(prompt("How Many Students Do You Have   "))
const amountOfSubject = Number(prompt("How Many Subject Do They Offer   "))

function getScoreOfEachSubject(promptMessgae){
	user_score = prompt(promptMessgae)
		if(user_score < 0 || user_score > 100){
			while(true){
				console.log("InValid Score Score Must be Greater Than 0 and less or Equals to 100")
				user_score = prompt(promptMessgae)
				if(user_score  > 0 && user_score <=  100) break;
					}
				}
		return Number(user_score);
	}

function createObjectOfSubject(){
	subjectObject = {}
		sum = 0;
		index = 1
		subjectObject[`Name`] = prompt("Enter the students Name  ")
		for(let count = 0; count < amountOfSubject;count++){
			subjectObject[`Sub ${index}`] = getScoreOfEachSubject(`Enter Score For Subject ${index}  `)
			sum+= subjectObject[`Sub ${index}`]
			index++
			}
		subjectObject[`TotalScore`] = sum
		 subjectObject[`Average Score`] = sum / amountOfSubject
	return subjectObject
	}

function objectOfStudents(){
	index = 1
	for (let counter = 0; counter < amountOfStudents;counter++){
		console.log(`Enter the score of Student ${counter}`)			
		 schoolDatabase[counter] = createObjectOfSubject();
			index++;
		}
	}

objectOfStudents()
const printLine = () => console.log("=========================================================================================================")
function displayTable(){
	printLine()
	headTable = `\t\tStudents\t`
	for(let index = 0; index < amountOfSubject;index++){
		headTable += `sub${(index + 1)}\t`
			}
		headTable += `Tot\tAve\tPos\n`
		return headTable 
	}

console.log(displayTable())

function sortArray(array){
	hihestPositon = 0;
	for(let count = 0; count < array.length;count++){
		for(let counter = 0 ; counter < array.length;counter++){
			if(array[count][`TotalScore`] > array[counter][`TotalScore`]){
					hihestPositon = array[count]
					 array[count] =  array[counter]
					 array[counter] = hihestPositon
					}
				}

			}
		return array;

		}

function displayEschStudentScore(array){
		index = 1
	for(count = 0; count < array.length;count++){
		display = "\t\t"
	for(object in array[count]){
		display = display + array[count][object] + "\t"
				}
		display+=`${index}`
		console.log(display)
		index++
			}
		}
	sortArray(schoolDatabase)
	displayEschStudentScore(schoolDatabase)



