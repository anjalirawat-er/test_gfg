class Employee:
    def __init__(self, id: int, salary: int):
        self.id = id
        self.salary = salary

    def get_info(self) -> str:
        return f"EmployeeID:{self.id} Salary:{self.salary}"


class SalesEmployee(Employee):
    def __init__(self, id: int, salary: int, sales: int = 0):
        super().__init__(id, salary)
        self.sales = sales

    def get_info(self) -> str:
        return f"EmployeeID:{self.id} Salary:{self.salary} Sales:{self.sales}"