# ru.nti.team.test
Тестовое задание Nti
Создано в NetBeans. Для работы необходимо: MySQL и созданной в ней базой testnti, Postman для задания запросов post, get, put, delete.
Программа использует Spring для создания сущностей manager_entity(правители) и planet_entity(планеты). Сущности связаны посредством поля manager_id - один ко многим.
Через запросы put наполняем сущности в формате json:
{
    "name": "Titan" - планеты
}
{
    "name": "Jesus", - правители
    "age": 33
}
{
    "name": "Titan",
    "manager" {      - put запрос на изменение повелителя у планеты
         "id" : "3"
          }
}
