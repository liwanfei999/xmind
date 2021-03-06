/* ******************************************************************************
 * Copyright (c) 2006-2012 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See http://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/
package org.xmind.ui.internal.fishbone.structures;


public abstract class AbstractMainFishboneDirection implements IMainDirection {

    private boolean rightHeaded;

    public AbstractMainFishboneDirection(boolean rightHeaded) {
        this.rightHeaded = rightHeaded;
    }

    public boolean isTransformerEnabled() {
        return rightHeaded;
    }

//    public int calcChildNavigation(IBranchPart branch, String navReqType) {
//        return Fishbone.NAV_NONE;
//    }
//
//    public int calcNavigation(IBranchPart branch, String navReqType) {
//        return Fishbone.NAV_NONE;
//    }
}