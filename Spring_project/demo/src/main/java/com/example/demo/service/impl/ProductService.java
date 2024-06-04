package com.example.demo.service.impl;

import com.example.demo.dto.ProductContainer;
import com.example.demo.dto.ProductDto;
import com.example.demo.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {

    @Override
    public ProductContainer getAllProducts() {


        ProductContainer productContainer = new ProductContainer();
        List<ProductDto> productDtoList = new ArrayList<>();

        ProductDto productDto1 = new ProductDto();
        productDto1.setId(101);
        productDto1.setProductname("Soap");
        productDto1.setDescription("Body wash product");
        productDto1.setPrice(50);

        ProductDto productDto2 = new ProductDto();
        productDto2.setId(102);
        productDto2.setProductname("Shampoo");
        productDto2.setDescription("Hair wash product");
        productDto2.setPrice(150);

        ProductDto productDto3 = new ProductDto();
        productDto3.setId(103);
        productDto3.setProductname("Toothpaste");
        productDto3.setDescription("Mouth wash product");
        productDto3.setPrice(100);

        ProductDto productDto4 = new ProductDto();
        productDto4.setId(104);
        productDto4.setProductname("Harpik");
        productDto4.setDescription("Cleaning product");
        productDto4.setPrice(200);

        productDtoList.add(productDto1);
        productDtoList.add(productDto2);
        productDtoList.add(productDto3);
        productDtoList.add(productDto4);

        productContainer.setProducts(productDtoList);

        return productContainer;
    }

}


