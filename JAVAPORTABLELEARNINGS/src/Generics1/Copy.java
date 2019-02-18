package Generics1;

import java.util.List;

public class Copy {

	public Copy() {
		// TODO Auto-generated constructor stub
	}
	public void copy(List<? extends Product> src, List<? super Product> dest){ 
		/*
		 * super this wildcard(reserved word) 
		 * extends - ограничение сверху
		 * super - ограничение снизу
		 * IN - аргумент: предоставление значение - extends
		 * OUT - аргумент: получение значение - super
		 * Если до In можно достучатся черезх методы Object , тогда используйте ?
		 * Если переменніе одновременно in and out  то  не использовать wildcard
		 */
		for (Product p : src){
			dest.add(p);
		}
	}
}
