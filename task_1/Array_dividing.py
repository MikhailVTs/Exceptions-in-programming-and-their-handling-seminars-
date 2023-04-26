from random import randint


class FirstOfTheListsIsEmpty(Exception):
    pass


class SecondOfTheListsIsEmpty(Exception):
    pass


class TheLengthOfTheArraysIsDifferent(Exception):
    pass


class DivisionByZero(Exception):
    pass


def first_list_is_empty():
    if first_array:
        return True
    raise FirstOfTheListsIsEmpty("Первый список пуст")


def second_list_is_empty():
    if second_array:
        return True
    raise SecondOfTheListsIsEmpty("Второй список пуст")


def length_of_arrays():
    if len(first_array) == len(second_array):
        return True
    raise TheLengthOfTheArraysIsDifferent("Длина массивов разная")


def division_zero():
    if all(x != 0 for x in second_array):

        return True
    raise DivisionByZero("Деление на ноль!!!")


def array_div():

    div_array = [x / y for x, y in zip(first_array, second_array)]
    print(f"{first_array} / {second_array} = {div_array}")

    return div_array


def checking_for_arrays():

    try:
        if first_list_is_empty() and second_list_is_empty() and length_of_arrays() and division_zero():
            print("Частность элементов двух входящих массивов в той же ячейке.")
            array_div()
    except FirstOfTheListsIsEmpty as e:
        print(f"Внимание:  {e}.")
    except SecondOfTheListsIsEmpty as e:
        print(f"Внимание:  {e}.")
    except TheLengthOfTheArraysIsDifferent as e:
        print(f"Внимание:  {e}.")
    except DivisionByZero as e:
        print(f"Внимание:  {e}.")


if __name__ == "__main__":

    first_array = [randint(0, 10) for i in range(5)]
    second_array = [randint(0, 10) for i in range(5)]

    print()

    checking_for_arrays()
