package fr.orionbs.plot_project_project.adapter.persistence.plot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "plot")
public class PlotEntity {

    @Id
    private String id;
}
