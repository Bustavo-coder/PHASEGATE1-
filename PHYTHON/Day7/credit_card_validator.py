def get_input(prompt_message):
	prompt = input('prompt_message')
	return prompt
def validate_user_input(input):
	if type(input) != str or any(value.isalpha() for value in input):
		raise TypeError("Must Pass In Only String of Numbers")
	return len(input) >= 13 and len(input) <= 16
def check_type_of_card(input):
	card_type = "Invalid Card"
	if input[0] == '4': card_type = "Visa Card"
	if input[0] == '5': card_type = "Master Card"
	if input[0] == '6': card_type = "Discover Card"
	if input[0] == '3' and input[1] == '7': card_type = "American Express Card"
	return card_type

def calculate_card_no(input):
	sum_of_odd_position = 0
	sum_of_even_position = 0
	for index,value in enumerate(input):
		element = (int) (value)
		square = 2 * element
		if square > 9:
			first_num = square % 10
			second_num = square // 10
			square = first_num + second_num
		if index % 2 == 0: sum_of_even_position += square
		else : sum_of_odd_position += element
	sum_card = sum_of_odd_position + sum_of_even_position
	return sum_card
		
def validate_card(input):
	if type(input) != int :
		raise TypeError('Only accpt Int')
	response = "Invalid"
	if(input % 10 == 0) : response = "Valid"
	return response
		