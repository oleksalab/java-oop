# Урок # 6 - Многопоточное программирование. часть 1
- _страница:292_
- _задания:316_

> Самостоятельно:
- Executors, интерфейсы Collable и Future (_страница:317_)

Однопоточное выполнение:

```
    1           2          3
[  t1  ] -> [  t1  ] -> [  t1  ]
```

Например, если возможно разбить блок №2 на небольшие блоки, которые можно выполнить
независимо один от другого и одновременно тогда мы прийдём к нескольким потокам

Многопоточное выполнение:

```
          /  [  t2  ]  \
[  t1  ] ->  [  t3  ]  -> [  t1  ]
          \  [  t4  ]  /
```

Следовательно время выполнение программ с разным количество потоков будет имееть такое отношение:

    Tмп <= Tод

т.е. время выполнения многопоточной программы будет не больше (меньше или равно) времени работы однопоточной программы.

Оценка прироста производительности работы программы при использовании распараллеливания задачи:
- Закон Амдала
- Закон Густавсона - Барсиса

При написании многопоточных программ есть два вариата:

- реализация интерфейса Runnable
- расширение класса Thread

> Рекомендуется использовать реализацию интерфейса Runnable - он более легковесный, т.к. не нужно копировать весь набор
функционала класса Thread


























## Домашние задания

