import unittest
import mbti_test_app

class TestFuctionacceptinput(unittest.TestCase):
	def test_checkuserinput_returns_correct_result(self): 
		value = 'a'
		result = mbti_test_app.get_user_input("Welcome to Check Personal \n")
		self.assertEqual(result, value)

class TestFunctionvalidateuserinput(unittest.TestCase):
	def test_that_is_validation_takes_correct_result(self):
		self.assertRaises(TypeError, mbti_test_app.get_validation,1)
	def test_that_get_validation_return_right_result(self):
		value = 'a'
		result = mbti_test_app.get_validation(value)
		self.assertEqual(result , value)
	def test_that_get_validation_return_behaves_right_with_incorrect_result(self):
		value = 'f'
		result = mbti_test_app.get_validation(value)
		self.assertNotEqual(result , value)
	def test_that_get_validation_return_behaves_right_with_numbers_string(self):
		value = '1'
		result = mbti_test_app.get_validation(value)
		self.assertNotEqual(result , value)

class TestFunctionDisplayQuestion(unittest.TestCase):
	def test_that_display_queston_take_incorrect_input(self):
		self.assertRaises(TypeError,mbti_test_app.display_queston_return_response,"1")
	def test_that_display_queston_take_a_list_that_does_not_contain_dict(self):
		list_input = [1,2,3,"4","Name"]
		self.assertRaises(TypeError,mbti_test_app.display_queston_return_response,list_input)


class TestfunctionPersonality(unittest.TestCase):
	def test_that_get_personality_takes_incorrect_result(self):
		self.assertRaises(ValueError, mbti_test_app.get_personality,1)
	def test_that_get_personality_takes_return_correct_result_if_a_greater_that_b(self):
		option_A = 5 ; option_B = 3
		result = mbti_test_app.get_personality([option_A,option_B,'M','N'])
		self.assertEqual(result, 'M')
	def test_that_get_personality_takes_return_correct_result_if_b_greater_that_a(self):
		option_A = 3 ; option_B = 5
		result = mbti_test_app.get_personality([option_A,option_B,'M','N'])
		self.assertEqual(result, 'N')


