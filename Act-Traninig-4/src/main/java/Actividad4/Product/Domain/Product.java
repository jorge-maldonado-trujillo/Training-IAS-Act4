package Actividad4.Product.Domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class Product {
	ProductId ID;
	Name name;
	Description description;
	BasePrice basePrice;
	TaxRate taxRate;
	ProductStatus productStatus;
	InventoryQuantity inventoryQuantity;
	
}
