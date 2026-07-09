# Implement Employee and SalesEmployee classes here
class Employee:
    def __init__(self, id: int, salary: int):
        # Initialize the base attributes
        self.id = id
        self.salary = salary

class SalesEmployee(Employee):
    def __init__(self, id: int, salary: int, sales: int):
        # Call the parent class constructor to initialize id and salary
        super().__init__(id, salary)
        # Initialize the new subclass attribute
        self.sales = sales