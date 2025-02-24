/*
 * @fileoverview    {ConductorDTO}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.api.dto;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Description of {@code ConductorDTO}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class ConductorDTO {

    private String strIdentificacion;
    private String strNombreConductor;
    private Date dtFechaNacimiento;
    private String strLicenciaConduccion;
    private Date dtFechaVencimiento;
    private String strObservaciones;
    private String strTipoSancion;
    private Date dtFechaInicioSancion;
    private Date dtFechaFinalSancion;
    private String strDiasSancion;

}
