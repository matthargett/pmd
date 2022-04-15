/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.internal.util.xml;

import net.sourceforge.pmd.util.log.MessageReporter;

import com.github.oowekyala.ooxml.messages.XmlException;
import com.github.oowekyala.ooxml.messages.XmlMessageReporter;

/**
 * @author Clément Fournier
 */
public interface PmdXmlReporter extends XmlMessageReporter<MessageReporter> {

    void addExceptionToThrowLater(XmlException e);

}
