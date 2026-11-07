package com.zosh.modal;

import com.zosh.domain.VerficationType;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class TwoFactorAuth {
    private boolean isEnabled = false;
    private VerficationType sendTo;
}