def get_user_input(prompt_messgae):
	user_input = input(prompt_messgae).lower()
	return user_input 
def get_validation(user_input):
	if type(user_input)!= str :
		raise TypeError
	while (True) :
		if user_input == 'a' or user_input == 'b':
			break
		else : 
			print("Expected A or B as Response,\n I Know this is an Error Please Try again")
			user_input = input('Pick Either A OR B\n')
	return user_input

LIST_OF_QUESIONS = [
			{
				'a': 'A .>>> Expend Energy, enjoy groups',
				'b': 'B.>>> Conserve energy,enjoy one-on-one',
				},
			{
				'a': 'A .>>> Interpret Literally',
				'b': 'B.>>> Looking for Meaning,and Possibilities',
				},
			{
				'a': 'A .>>> Logical Thinking , Questioning',
				'b': 'B.>>> Empathetic Feeling , and Accomodating',
				},
				{
				'a': 'A .>>> Organized, Orderly',
				'b': 'B.>>> Flexible, Adaptable',
				},

				{
				'a': 'A .>>> More Outgoing, Think out loud',
				'b': 'B.>>> More Reserved, Think To Yourself',
				},
				{
				'a': 'A .>>> Practical, Realistic, Experiential',
				'b': 'B.>>> Imaginative, Innovative, Theoretical',
				},
				{
				'a': 'A .>>> Candid, Straight Forward, Frank',
				'b': 'B.>>> Tactful, Kind, Encouraging',
				},
				{
				'a': 'A .>>> Plan, Schedule',
				'b': 'B.>>> Unplanned, Spontaneous',
				},
				{
				'a': 'A .>>> Seek Many Tasks, Public Activities, Interaction With Others',
				'b': 'B.>>> Seek Private, Solitary Activities With Quiet to Concentrate',
				},
				{
				'a': 'A .>>> Standard, Usual, Conventionals',
				'b': 'B.>>> Different, Novel, Unique',
				},
				{
				'a': 'A .>>> Firm, tend to Criticize, hold the line',
				'b': 'B.>>> Gentle, Tend to Appreciate, Conciliate',
				},
				{
				'a': 'A .>>>Regulated, Structured',
				'b': 'B.>>>Easy-Going, Live and Let Live',
				},
				{
				'a': 'A .>>>External, Communicative, Express Yourself',
				'b': 'B.>>>Internal, Reticent, Keep to Yourself ',
				},
				{
				'a': 'A .>>>Focus on here-and-now',
				'b': 'B.>>>Look to The Future, Global Perspective, Big picture ',
				},
				{
				'a': 'A .>>>Tough-Minded, Just',
				'b': 'B.>>>Tender-hearted, merciful',
				},
				{
				'a': 'A .>>>Preparation, Plan Ahead',
				'b': 'B.>>>Go With the Flow, Adapt as you Go',
				},
				{
				'a': 'A .>>>Active, Initiate',
				'b': 'B.>>>Reflective, Deliberate',
				},
				{
				'a': 'A .>>>Facts, Things, What Is',
				'b': 'B.>>>Ideas, Dreams, What Could Be',
				},
				{
				'a': 'A .>>>Matter of Fact, Issue-Oriented',
				'b': 'B.>>>Sensitive, People-Oriented',
				},
				{
				'a': 'A .>>>Control, Govern',
				'b': 'B.>>>Latitude, Freedom',
				},
		]

store_response = []
def display_queston_return_response(questions):
	if type(questions) != list or any(type(element) != dict for element in questions) :
		raise TypeError("Only Takes a list that contains dict")
	for index,element in enumerate (questions):
		for object in questions[index]:
			print(questions[index][object])
		user_response = get_user_input('Kindly chosse From the options A or B\n')
		validated_input = get_validation(user_response)
		store_response.append(validated_input)
	return store_response

def get_personality(list_input):
	if type(list_input) != list:
		raise ValueError
	result = ""
	if list_input[0] > list_input[1] : result = list_input[2]
	else : result = list_input[3]
	return result

def dislay_personlity_type_and_userChoice(list_questions):
	personality = ""
	for count in range(4):
		option_A = 0;option_B = 0
		for counter in range(count,len(list_questions),4):
			print(list_questions[counter][store_response[counter]])
			if store_response[counter] == 'a' : option_A += 1
			else : option_B += 1
		print(f"Number of A selected {option_A}")
		print(f"Number of B selected {option_B}")
		if count == 0 : personality += get_personality([option_A,option_B,'E','I'])		
		if count == 1 : personality += get_personality([option_A,option_B,'S','N'])
		if count == 2 : personality += get_personality([option_A,option_B,'T','F'])
		if count == 3 : personality += get_personality([option_A,option_B,'J','P'])
	return personality


user_name = get_user_input('What is your Name\n')

display_queston_return_response(LIST_OF_QUESIONS)
print(f"Hello {user_name} you Selected")

store_personality = dislay_personlity_type_and_userChoice(LIST_OF_QUESIONS)
print(f"Your Personality is {store_personality}")
