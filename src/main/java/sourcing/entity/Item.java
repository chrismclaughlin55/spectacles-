package sourcing.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="items")
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="ebay_id")
    private String ebayId;

    @Column(name="category")
    private String category;

    @JoinColumn
    @OneToMany(cascade={CascadeType.ALL})
    private List<MarketplaceInfo> marketplaceInfos;

}