function getGrade(arrayScores){
			let averageSum = 0 
	arrayScores.forEach((element) => {averageSum  += element})
			average = averageSum / arrayScores.length

			let grade = '1'
			if (average >= 90  && average <= 100) grade = 'A'
			if (average >= 80  && average < 90) grade = 'B'
			else if (average >= 70 && average < 80) grade = 'C'
			else if (average >= 60 && average < 70) grade = 'D'
			else if (average >= 0 && average < 60) grade = 'F'
			return grade
		}

	console.log(getGrade([20,30,40]));
	console.log(getGrade([100,90,100,90]));
