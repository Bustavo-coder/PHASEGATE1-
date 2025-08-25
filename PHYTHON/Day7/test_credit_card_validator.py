import credit_card_validator
import unittest

#class TestFunctioncollectInput(unittest.TestCase):
	#def test_get_input(self):
		#credit_card_validator.get_input('Input Your Name \n')

class TestFunctionValidateInput(unittest.TestCase):
	def test_that_validat_user_input_take_incorrect_result(self):
		self.assertRaises(TypeError,credit_card_validator.validate_user_input, 1)
	def test_that_validate_user_input_does_not_letters(self):
		value = '1234A'
		self.assertRaises(TypeError,credit_card_validator.validate_user_input,value)
	def test_that_validate_user_input_return_true_with_a_13_digit_value(self):
		value = "12345678910111"
		result = credit_card_validator.validate_user_input(value)
		self.assertTrue(result)
	def test_that_validate_user_input_return_true_with_a_16_digit_value(self):
		value = "1234567812345678"
		result = credit_card_validator.validate_user_input(value)
		self.assertTrue(result)
	def test_that_validate_user_input_return_true_with_a_12_digit_value(self):
		value = "12345678123"
		result = credit_card_validator.validate_user_input(value)
		self.assertFalse(result)

class TestFunctionTypeOfCard(unittest.TestCase):
	def test_that_get_card_return_correct_result_of_visa_card(self):
		value = "434567812345678"
		result =  credit_card_validator.check_type_of_card(value)
		self.assertEqual(result,"Visa Card")

	def test_that_get_card_return_correct_result_of_master_card(self):
		value = "534567812345678"
		result =  credit_card_validator.check_type_of_card(value)
		self.assertEqual(result,"Master Card")

	def test_that_get_card_return_correct_result_of_American_Express(self):
		value = "374567812345678"
		result =  credit_card_validator.check_type_of_card(value)
		self.assertEqual(result,"American Express Card")

class TestFunctionCalculateCardNo(unittest.TestCase):
	def test_that_function_calculate_card_no_return_correct_result(self):
		value = "12345"
		result = credit_card_validator.calculate_card_no(value)
		self.assertEqual(result,15)
	def test_that_function_calculate_card_no_with_card_numbers(self):
		value = "4388576018402626"
		result = credit_card_validator.calculate_card_no(value)
		self.assertEqual(result,75)
	
	def test_that_function_calculate_card_no_with_card_numbers_2(self):
		value = "4388576018410707"
		result = credit_card_validator.calculate_card_no(value)
		self.assertEqual(result,70)
		
class TestFunctionValidateCard(unittest.TestCase):
	def test_that_validate_take_incorrect_type_of_value(self):
		self.assertRaises(TypeError,credit_card_validator.validate_card,"Name")
	def test_that_validate_returns_correct_result_valis(self):
		result = credit_card_validator.validate_card(70)
		self.assertEqual(result ,"Valid")
	def test_that_validate_returns_correct_result_invalid(self):
		result = credit_card_validator.validate_card(75)
		self.assertEqual(result ,"Invalid")