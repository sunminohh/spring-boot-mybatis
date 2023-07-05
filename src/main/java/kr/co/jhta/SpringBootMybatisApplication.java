package kr.co.jhta;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import kr.co.jhta.mapper.ProductMapper;
import kr.co.jhta.vo.Product;

@SpringBootApplication
public class SpringBootMybatisApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootMybatisApplication.class, args);
		
		ProductMapper mapper = ctx.getBean(ProductMapper.class);
		
		// 새 상품 추가
//		Product product = new Product();
//		product.setName("거북이태블릿");
//		product.setMaker("거북이월드");
//		product.setDescription("거북이들을 위한 태블릿");
//		product.setPrice(10000);
//		product.setDiscountPrice(9000);
//		product.setStock(10);
//		product.setCatNo(102);
//		
//		mapper.insertProduct(product);
		
		// 모든 상품 정보 조회
//		List<Product> products = mapper.getAllProducts();
//		for (Product product : products) {
//			System.out.println("상품번호: " +product.getNo()+ "\t"+ "상품이름: " +product.getName()+ "\t" + "상품가격: " +product.getPrice());
//		}
		
		// 상품번호에 해당하는 상품정보 하나 조회
//		Product product = mapper.getProductByNo(1126);
//		System.out.println("상품번호: " +product.getNo()+ "\t"+ "상품이름: " +product.getName());
		
		// 상품번호에 해당하는 상품정보 삭제
//		mapper.deleteProductByNo(1112);
		
		// 변경된 상품정보를 전달받아서 상품정보 변경
//		Product product = new Product();
//		product.setNo(1126);
//		product.setName("거북이헤드폰");
//		product.setMaker("거북이월드");
//		product.setDescription("거북이들을 위한 헤드폰");
//		product.setOnSell("N");
//		product.setPrice(200000);
//		product.setDiscountPrice(190000);
//		product.setStock(20);
//		product.setCatNo(107);
//		
//		mapper.updateProductByNo(product);
		 
		// 상품이름, 제조회사, 최소가격/최대가격, 카테고리 번호를 전달받아서 상품정보를 검색 
		// (검색 조건은 위에 나열된 것 중에서 하나도 사용되지 않을 수도, 전부 사용될 수도 있다.) 
//		Map<String, Object> param = new HashMap<String, Object>();
//		param.put("name", "거북이");
//		param.put("maker", "거북이월드");
//		param.put("min", 5000);
//		param.put("max", 2000000);
//		param.put("catNo", 101);
//		
//		List<Product> products = mapper.searchProducts(param);
//		System.out.println("조회건수: " +products.size());
	}

}







