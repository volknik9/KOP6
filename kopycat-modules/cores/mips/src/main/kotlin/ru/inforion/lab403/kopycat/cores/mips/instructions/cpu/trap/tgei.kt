/*
 *
 * This file is part of Kopycat emulator software.
 *
 * Copyright (C) 2020 INFORION, LLC
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * Non-free licenses may also be purchased from INFORION, LLC, 
 * for users who do not want their programs protected by the GPL. 
 * Contact us for details kopycat@inforion.ru
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 */
package ru.inforion.lab403.kopycat.cores.mips.instructions.cpu.trap

import ru.inforion.lab403.common.extensions.asInt
import ru.inforion.lab403.kopycat.cores.mips.exceptions.MipsHardwareException
import ru.inforion.lab403.kopycat.cores.mips.instructions.RsImmInsn
import ru.inforion.lab403.kopycat.cores.mips.operands.MipsImmediate
import ru.inforion.lab403.kopycat.cores.mips.operands.MipsRegister
import ru.inforion.lab403.kopycat.modules.cores.MipsCore

/**
 *
 * TGEI rs, immediate
 *
 * To compare a GPR to a constant and do a conditional trap
 *
 * Compare the contents of GPR rs and the 16-bit signed immediate as signed integers; if GPR rs is greater than
 * or equal to immediate, then take a Trap exception.
 */
class tgei(core: MipsCore,
           data: Long,
           rs: MipsRegister,
           imm: MipsImmediate) : RsImmInsn(core, data, Type.VOID, rs, imm) {

    override val mnem = "tgei"

    override fun execute() {
        // Compare as signed integers
        // TODO: Refactor legacy operand class usage
        if (vrs.asInt >= imm.ssext.asInt) throw MipsHardwareException.TR(core.pc)
    }

}