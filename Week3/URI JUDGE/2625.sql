select concat(substring(cpf, 1, 3), concat('.', concat(substring(cpf, 4, 3),concat('.', concat(substring(cpf, 7, 3), concat('-', substring(cpf, 10, 2)))))))
from natural_person