package kz.bitlab.middle02.micro01.micro01.repsoitory;

import kz.bitlab.middle02.micro01.micro01.model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemModel, Long> {


}
